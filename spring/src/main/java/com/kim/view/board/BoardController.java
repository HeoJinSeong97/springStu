package com.kim.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.kim.app.board.BoardListVO;
import com.kim.app.board.BoardService;
import com.kim.app.board.BoardVO;

@Controller
@SessionAttributes("boardData")
public class BoardController {

	@Autowired
	private BoardService boardService;
	// ����Ͻ� ������Ʈ

	/*@RequestMapping("/dataTransform.do")
	@ResponseBody
	public List<BoardVO> dataTransform(BoardVO vo) {
		vo.setSearch("title");
		vo.setSearchContent("");
		List<BoardVO> datas=boardService.getBoardList(vo);
		return datas;
	}*/
	@RequestMapping("/dataTransform.do")
	@ResponseBody
	public BoardListVO dataTransform(BoardVO vo) {
		vo.setSearch("title");
		vo.setSearchContent("");
		List<BoardVO> datas=boardService.getBoardList(vo);
		BoardListVO blVO=new BoardListVO();
		blVO.setBoardList(datas);
		
		return blVO;
	}

	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException{ // == Command��ü
		System.out.println("insertBoard");

		/*
		V-enctype
		C-command��ü(M)
  		����� MF
  		.xml�� <bean>��ü����
  		-> pom.xml
  		��� �ٿ�ε�
		 */
		MultipartFile uploadFile=vo.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName=uploadFile.getOriginalFilename();
			// System.out.println(fileName); // 3.jpg
			uploadFile.transferTo(new File("D:\\0512_KIM\\memo\\"+fileName));
			// ���ε��� ������ �����ϴ� ��θ� �ۼ��صθ� �ٿ��
		}

		boardService.insertBoard(vo); // ����Ͻ� �޼���
		
		return "getBoardList.do"; // redirect:
	}
	@ModelAttribute("resultMap")
	public HashMap<String,String> searchMap() {
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("제목","title");
		map.put("내용", "content");
		return map;
	}
	/*@RequestMapping(value="/getBoardList.do")t
	public String getBoardList(@RequestParam(value="search",defaultValue="itle",required=false)String search,@RequestParam(value="searchContent",defaultValue="",required=false)String searchContent,BoardDAO dao,Model m)  {
		System.out.println("�Խ��� ��Ϻ��� ��Ʈ�ѷ�");

		System.out.println(search);
		System.out.println(searchContent);
		List<BoardVO> boardList=dao.getBoardList(vo);

		m.addAttribute("boardList", boardList);

		return "getBoardList.jsp";
	}*/
	@RequestMapping(value="/getBoardList.do")
	public String getBoardList(BoardVO vo,Model m)  {
		System.out.println("getBoardList");

		if(vo.getSearch()==null) {
			vo.setSearch("title");
		}
		if(vo.getSearchContent()==null) {
			vo.setSearchContent("");
		}

		List<BoardVO> boardList=boardService.getBoardList(vo);

		m.addAttribute("boardList", boardList);

		return "getBoardList.jsp";
	}
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo,Model m) {
		System.out.println("getBoard");

		BoardVO v=boardService.getBoard(vo);

		m.addAttribute("boardData",v);

		return "getBoard.jsp";
	}
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		System.out.println("deleteBoard");

		boardService.deleteBoard(vo);

		return "getBoardList.do";
	}
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("boardData")BoardVO vo) {
		System.out.println("updateBoard");
		System.out.println(vo.getWriter());
		// view���� ����ڰ� ���� �Է��������� �������ؼ� null�� ���´�!

		boardService.updateBoard(vo);

		return "getBoardList.do";
	}
}

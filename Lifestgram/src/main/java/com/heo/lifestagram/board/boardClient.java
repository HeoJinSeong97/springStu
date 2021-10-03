package com.heo.lifestagram.board;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

import com.heo.lifestagram.board.Impl.BoardDAO;


public class boardClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BoardVO vo = new BoardVO();
		BoardDAO dao = new BoardDAO();
		
		byte[] imageInByte;
        
		BufferedImage originalImage = ImageIO.read(new File("C:/Users/82109/Desktop/새 폴더/로아콘/냥바타1/210402_로아_흐물흐물_냥바타콘_100x100/짱이야.png"));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(originalImage, "png", baos);
		baos.flush();
		 
		imageInByte = baos.toByteArray();
		System.out.println(Arrays.toString(imageInByte));
		
		vo.setImg(imageInByte);
		vo.setContent("냥바타콘");
		vo.setUser("aaa");
		System.out.println(vo);
		List<BoardVO> ls = dao.getBoard(vo);
		
		for (BoardVO boardVO : ls) {
			System.out.println(boardVO);
		}
//		dao.insertBoard(vo);
	}

}

package com.musicplayer.bean;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.musicplayer.util.ImageUtil;

/**
 * 存放静态变量
 * @author followwwind
 *
 */
public class Constant {
	
	public static BufferedImage background = null;
	public static BufferedImage splash = null;
	public static BufferedImage footer = null;
	public static BufferedImage app = null;
	public static Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
	public static final int WIDTH = screensize.width - 340;
	public static final int HEIGHT = screensize.height - 110;
	public static File music = null;
	public static BufferedImage player = null;
	public static BufferedImage pre = null;
	public static BufferedImage next = null;
	public static BufferedImage pause = null;
	public static BufferedImage player2 = null;
	public static BufferedImage pre2 = null;
	public static BufferedImage next2 = null;
	public static BufferedImage pause2 = null;
	public static BufferedImage musicProgress = null;
	public static BufferedImage scrollBar = null;
	public static BufferedImage point = null;
	public static BufferedImage point2 = null;
	static{
		try {
			background = ImageIO.read(new File("img/bg.png"));
			splash = ImageIO.read(new File("img/splash.png"));
			footer = ImageIO.read(new File("img/footer.png"));
			app = ImageIO.read(new File("img/app.png"));
			music = new File("img/music.png");
			musicProgress = ImageIO.read(new File("img/musicbar.png"));
			scrollBar = ImageIO.read(new File("img/scrollbar.png"));
			point = ImageIO.read(new File("img/point.png"));
			point2 = ImageIO.read(new File("img/point_hover.png"));
			player = ImageUtil.cutImage(music, 36, 36, 36, 0);
			pre = ImageUtil.cutImage(music, 36, 36, 0, 0);
			next = ImageUtil.cutImage(music, 36, 36, 108, 0);
			pause = ImageUtil.cutImage(music, 36, 36, 72, 0);
			player2 = ImageUtil.cutImage(music, 36, 36, 36, 36);
			pre2 = ImageUtil.cutImage(music, 36, 36, 0, 36);
			next2 = ImageUtil.cutImage(music, 36, 36, 108, 36);
			pause2 = ImageUtil.cutImage(music, 36, 36, 72, 36);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

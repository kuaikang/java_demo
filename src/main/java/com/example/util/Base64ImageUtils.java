package com.example.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 * 
 * @author Administrator
 *
 */
public class Base64ImageUtils {
	public static void main(String[] args) {
		/** 测试从Base64编码转换为图片文件 */
		Base64ImageUtils.convertImage(img, "E:\\test1.jpg");

		/** 测试从图片文件转换为Base64编码 */
		//System.out.println(Base64ImageUtils.convertImageCode("E:\\test.jpg"));
	}

	/** 将图片文件转化为字节数组字符串，并对其进行Base64编码处理 */
	public static String convertImageCode(String imgFilePath) {
		byte[] data = null;

		/** 读取图片字节数组 */
		try {
			InputStream in = new FileInputStream(imgFilePath);
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/** 对字节数组Base64编码 */
		BASE64Encoder encoder = new BASE64Encoder();
		/** 返回Base64编码过的字节数组字符串 */
		return encoder.encode(data);
	}

	/** 对字节数组字符串进行Base64解码并生成图片 */
	public static boolean convertImage(String imgStr, String imgFilePath) {
		/** 图像数据为空 */
		if (imgStr == null) {
			return false;
		}
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			/** Base64解码 */
			byte[] bytes = decoder.decodeBuffer(imgStr);
			for (int i = 0; i < bytes.length; ++i) {
				/** 调整异常数据 */
				if (bytes[i] < 0) {
					bytes[i] += 256;
				}
			}
			/** 生成jpeg图片 */
			OutputStream out = new FileOutputStream(imgFilePath);
			out.write(bytes);
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
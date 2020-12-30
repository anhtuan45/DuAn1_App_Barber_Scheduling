/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatTocP2;

/**
 *
 * @author Nguyen Duc Thao
 */
import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class CreateQr {
    public static void main(String[] args) throws Exception {
		
		String data = "Nguyen Duc Thao";
		String path = "C:\\Users\\Nguyen Duc Thao\\Desktop\\ExeJava\\infybuzz.jpg";
		
		BitMatrix matrix = new MultiFormatWriter()
				.encode(data, BarcodeFormat.QR_CODE, 500, 500);
		
		MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));

	}
    
}

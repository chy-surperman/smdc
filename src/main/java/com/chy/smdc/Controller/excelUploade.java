package com.chy.smdc.Controller;

import com.chy.smdc.bean.ProductInfo;
import com.chy.smdc.service.impl.ProductInfoServiceImpl;
import com.chy.smdc.util.Result;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class excelUploade {
    @Autowired
    ProductInfoServiceImpl productInfoServiceimpl;
    @ResponseBody
    @RequestMapping(value = "test10",produces = "application/json;charset=UTF-8")
    public Result importData(MultipartFile file, HttpServletRequest request) {
        try {
            InputStream inputStream = file.getInputStream();
            Workbook workbook = Workbook.getWorkbook(inputStream);
            System.out.println(file.getOriginalFilename()+"----"+request.getRequestURL());
            Sheet sheet = workbook.getSheet(0);
            Cell cell = sheet.getCell(0, 0);
            System.out.println(cell.getContents());
            if(cell.getContents().equals("productName")){
                Cell[] productName = sheet.getColumn(0);
                Cell[] productPrice= sheet.getColumn(1);
                Cell[] productSellcount = sheet.getColumn(2);
                Cell[] productInformation = sheet.getColumn(3);
                Cell[] productStatus= sheet.getColumn(4);
                for (int i=1;i<productName.length;i++) {
                    ProductInfo productInfo = new ProductInfo();
                    productInfo.setProductName(productName[i].getContents());
                    productInfo.setProductPrice(new BigDecimal(productPrice[i].getContents()));
                    productInfo.setProductSellcount(Integer.valueOf(productSellcount[i].getContents()));
                    productInfo.setProductInformation(productInformation[i].getContents());
                    productInfo.setProductStatus(Integer.valueOf(productStatus[i].getContents()));
                    productInfoServiceimpl.save(productInfo);
                    System.out.println(productName[i].getContents()+"--"+productPrice[i].getContents()+"---"+productSellcount[i].getContents());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

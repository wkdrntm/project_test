package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController5 {
	@RequestMapping ("do")  //uri夸没 概俏
	public @ResponseBody ProductVO Asdf() {  //json 贸府
		ProductVO vo = new ProductVO("基敲惑前", 30000);
		return vo;
		
	}
}

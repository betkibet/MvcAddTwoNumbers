package com.add;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.add.service.AddService;

public class AdderController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int added = Integer.parseInt(req.getParameter("added"));
		int computation=  0;
//		int computation = num1 + num2;
		AddService a = new AddService();
		computation = a.add(num1, num2);
		String msg;
		
		Map<String, String>  map = new HashMap<String, String>();
		
		if(computation == added) {
			msg = "Success! Yay!. You are smart. The answer is: " + computation;
		}
		else
		{
			msg = "Error!. OOps. You are such a wimp! Unaanguka aje hivo? The answer should be: " + computation;
		}
		
		map.put("result", msg);
		ModelAndView mv = new ModelAndView("success", map);
		return mv;
	}

}

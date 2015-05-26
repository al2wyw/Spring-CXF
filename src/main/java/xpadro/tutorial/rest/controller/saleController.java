package xpadro.tutorial.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import xpadro.tutorial.rest.model.CustomerWithOrders;
import xpadro.tutorial.rest.model.mybatis.sale.Lineitem;
import xpadro.tutorial.rest.model.mybatis.sale.LineitemKey;
import xpadro.tutorial.rest.repository.mybatis.sale.CustomerWithOrdersMapper;
import xpadro.tutorial.rest.repository.mybatis.sale.LineitemMapper;

@Controller
public class saleController {
	@Autowired
	private LineitemMapper lineitemMapper;

	@Autowired
	private CustomerWithOrdersMapper customerWithOrdersMapper;
	
	@RequestMapping(value="/sale/lineitem", method=RequestMethod.GET, produces={"text/html"})
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public ModelAndView getLineItemByPage(@RequestParam("offset")int offset,@RequestParam("limit")int limit){
		ModelAndView model = new ModelAndView("lineitem");
		List<String> header = new ArrayList<String>();
		header.add("l_ORDERKEY");
		header.add("l_LINEINT");
		header.add("l_PARTKEY");
		header.add("l_SUPPKEY");
		header.add("l_QUANTITY");
		header.add(".l_EXTENDEDPRICE");
		header.add("l_DISCOUNT");
		header.add("l_TAX");
		header.add("l_RETURNFLAG");
		header.add("l_LINESTATUS");
		header.add("l_SHIPDATE");
		header.add("l_COMMITDATE");
		header.add("l_RECEIPTDATE");
		header.add("l_SHIPINSTRUCT");
		header.add("l_SHIPMODE");
		header.add("l_COMMENT");
		model.addObject("header", header);
		List<Lineitem> lineitem = lineitemMapper.selectByPage(offset, limit);
		model.addObject("lineitem", lineitem);
		return model;
	}

	@RequestMapping(value="/sale/lineitem", method=RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public List<Lineitem> getLineItemByPageAsJson(@RequestParam("offset")int offset,@RequestParam("limit")int limit){
		List<Lineitem> lineitem = lineitemMapper.selectByPage(offset, limit);
		return lineitem;
	}

	@RequestMapping(value="/sale/lineitemdetail", method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public Lineitem selectByPrimaryKey(@RequestParam("orderkey")int orderKey,@RequestParam("line")int line){
		LineitemKey key = new LineitemKey();
		key.setL_ORDERKEY(orderKey);
		key.setL_LINEINT(line);
		return lineitemMapper.selectByPrimaryKey(key);
	}

	@RequestMapping(value="/sale/orders", method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public CustomerWithOrders selectByPrimaryKey(@RequestParam("key")int key){
		return customerWithOrdersMapper.getCustomerWithOrdersById(key);
	}
}

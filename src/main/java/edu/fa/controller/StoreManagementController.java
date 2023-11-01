package edu.fa.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.model.Product;
import edu.fa.service.StoreService;

@Controller
public class StoreManagementController {
	@Autowired
	private StoreService storeService;

	@RequestMapping("/main")
	public String mainPage() {
		return "index2";
	}

	@RequestMapping("/listProduct")
	public String showListProduct(Model model) {
		List<Product> productList = new ArrayList<Product>();

		productList = (List<Product>) storeService.getAllProduct();
		model.addAttribute("productList", productList);
		return "listProduct";
	}

	@RequestMapping("/add")
	public String showAddProduct(Model model) {
		model.addAttribute("product", new Product());
		return "addProduct";
	}

	@RequestMapping(value = { "/add" }, method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product, Model model) {
		storeService.addProduct(product);
		return "redirect:/listProduct";
	}

	@RequestMapping("/detail")
	public String detailProduct(@RequestParam("UserId") int id, Model model) {
		Product p =  storeService.getProductById(id);
		System.out.println(p);
		model.addAttribute("product",p);
		model.addAttribute("id",p.getId());
		return "editProduct";
	}

	@RequestMapping(value = { "/update" }, method = RequestMethod.POST)
	public String editProduct(@ModelAttribute("product") Product product) {
		System.out.println(product);
		storeService.updateProduct(product);
		return "redirect:/listProduct";
	}

	@RequestMapping("/delete")
	public String deleteProduct(@RequestParam("UserId")int id) {
		System.out.println(id);
		storeService.deleteProduct(id);
		return "redirect:/listProduct";
	}
}

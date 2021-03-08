package com.finalproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDao;
import com.dao.StoreDao;
import com.dto.Product;
import com.dto.Store;

@RestController
public class ProductController //implements ErrorController
	{

	/*
	private static final String PATH = "/error";

    @RequestMapping(value = "/pageNotFound", method = { RequestMethod.GET, RequestMethod.POST })
    public String pageNotFound() {
        return "pageNotFound";
    }

    @RequestMapping(value = "/accessDenied", method = { RequestMethod.GET, RequestMethod.POST })
    public String accessDenied() {
        return "accessDenied";
    }

    @RequestMapping(value = PATH)
    public String error() {
        return "error";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
	*/
	@Autowired
	ProductDao productDao;
	
	@Autowired
	StoreDao storeDao;
	
	@GetMapping("register_item")
	public void register() {
		List<Store> storeList = storeDao.getAllStores();
		Product item1 = new Product("Rice", "Kitchen","Priya","Fine quality of rice, with refined machinery", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item2 = new Product("Wheat", "Kitchen","Symbol","Fine quality of wheat, with refined machinery", 20,500, 200, "12/2/2021", "12/2/2025", storeList.get(1));
		Product item3 = new Product("Eggs", "Kitchen","Amul","Freshly dispatched eggs from hybrid chickens", 0.5, 50, 150, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item4 = new Product("Goodday","snacks","Britannia","With its delightful aroma and crunchy cookie bite,good day cookie comes with a smiley design on it as well",100,300,10,"2020-03-23","2020-11-26", storeList.get(0));
		Product item5 = new Product("pen","stationary","Parker","Innovative high quality fine writing instrument crafted for writers,students and business professionals",1.5,50,10,"2021-09-24","2022-08-21", storeList.get(0));
		Product item6 = new Product("pencil","Stationary","Apsara","made of high quality wood and features a strong lead that prevents breakage and provides a loner writing life",1.5,100,5,"2020-04-12","2020-06-13", storeList.get(0));
		Product item7 = new Product("Eraser","Stationary","Nataraj","Nataraj eraser is used to erase the pencil marks from paper ,accepected for their rubbery consistency",32,50,5,"2020-01-10","2022-03-16", storeList.get(0));
		Product item8 = new Product("face powder","ladies emporiem","LorealPowder","face powder and setting powder find pressed powder mattifying powder and transucent powder long lasting finish",0.1,10,150,"2020-01-01","2022-02-03", storeList.get(0));
		Product item9 = new Product("Masalas ","Kitchen","MTR","Used  in cooking more varities of chicken,samber pickles ",10,25,50,"2021-02-03","2021-11-20", storeList.get(0));
		Product item10 = new Product("Boost","Kitchen","Nestle","Adds more energy",15,30,150,"2021-02-03","2022-08-12", storeList.get(0));
		Product item11 = new Product("Garlic paste","Kitchen","National"," contains preservatives ",05,30,60,"2021-06-03","2022-04-05", storeList.get(0));
		Product item12 = new Product("Tea powder","Kitchen","Red Lable","Refreshing blend of  quality",05,150,30,"2021-02-03","2022-05-06", storeList.get(0));
		Product item13 = new Product("Mung bean","Kitchen","Shree balram seeds","more benifites in weight loss",05,60,40,"2020-02-03","2021-07-06", storeList.get(0));
		Product item14 = new Product("Chilli powder","Kitchen","Tikhalal","Naturally adds deep red colour to recipes",30,200,60,"2021-02-03","2021-12-06", storeList.get(0));
		Product item15 = new Product("Ghee","Kitchen","Amul","It is incredibly versatile",02,20,100,"2021-02-03","2022-07-06", storeList.get(0));
		Product item16 = new Product("Oil","Kitchen","Sunflower","Excellent sources of vitamins E,B1,B6,Iron",03,300,89.09,"2020-02-03","2025-07-06", storeList.get(0));
		Product item17 = new Product("Oats","Kitchen","Safola","Least processed and contain most nutrition",05,60,90.00,"2021-02-03","2023-07-06", storeList.get(0));
		Product item18 = new Product("Maggie", "Kitchen", "Topromen", "Instant soup and noodles",01,50,100,"2020-02-03","2020-10-06", storeList.get(0));
		Product item19 = new Product("Wheat", "Kitchen", "Organic Atta", "Smooth and easire",05,50,60,"2020-02-03", "2021-10-06", storeList.get(0));
		Product item20 = new Product("Cardamom", "Kitchen", "Spicebay", "To get smoky flavour",10,50,60.00, "2021-06-03", "2024-12-08", storeList.get(0));
		Product item21 = new Product("Salt", "Kitchen", "Tata", "salt is a main mineral constitute", 02,20,80.00,"2021-02-03", "2025-07-06", storeList.get(0));
		Product item22 = new Product("Sauce", "Kitchen", "Tomato ketchup", "add flavors,moisture and visual appeal to dish", 01,50,200,"2021-05-10", "2021-05-20", storeList.get(0));
		Product item23 = new Product("Sugar", "Kitchen", "Madhur", "Sugar is crystalline carbohydrates",05,500,89.89, "2021-02-03", "2021-07-06", storeList.get(0));
		Product item24 = new Product("Flour", "Kitchen", "Aashirvaad", "It is more fluffy and soft rotiesat home,grinding process for the perfect balance ofcolour,taste ",05,200,87.07, "2021-02-03", "2021-07-06", storeList.get(0));
		Product item25 = new Product("Eggs", "Kitchen", "Desi", "Desi eggs  are good for health",02,50,60.05, "2006-03-25", "2006-05-20", storeList.get(0));
		Product item26 = new Product("Rice", "kitchen", "India Gate", "Exotic class of Basmathi,it embodies all the attributes of a true basmati rice grain", 50,900,850.25, "2020-06-10", "2022-05-10", storeList.get(0));
		Product item27 = new Product("Garlic paste","Kitchen","National","contains preservatives ",02,200,56,"2021-06-03","2022-04-05", storeList.get(0));
		Product item28 = new Product("Mung bean","Kitchen","Shree balram seeds","more benifites in weight loss",02,100,23.02,"2020-02-03","2021-07-06", storeList.get(0));
		Product item29 = new Product("Masalas ","Kitchen","MTR","Used  in cooking more varities of chicken,samber pickles ",1,20,25,"2021-02-03","2021-11-20", storeList.get(0));
		Product item30 = new Product("Oil","Kitchen","freedom","Excellent sources of vitamins E,B1,B6,Iron",02,200,79.89,"2020-02-03","2025-07-06", storeList.get(0));
		Product item31 = new Product("Salt", "Kitchen", "Tata", "salt is a main mineral constitute",03,200,49.99, "2021-02-03", "2025-07-06", storeList.get(0));
		Product item32 = new Product("Flour", "Kitchen", "Aashirvaad", "It is more fluffy and soft rotiesat home,grinding process for the perfect balance ofcolour,taste ",03,300,60.23,"2021-02-03", "2021-07-06", storeList.get(0));
		Product item33 = new Product("Sauce", "Kitchen", "Tomato ketchup", "add flavors,moisture and visual appeal to dish",01,500,60.25, "2021-05-10", "2021-05-20", storeList.get(0));
		Product item34 = new Product("face powder","ladies emporiem","LorealPowder","face powder and setting powder  find pressed powder,mattifying powder and transucent powder long lasting finish",0.1,10,150,"2020-01-01","2022-02-03", storeList.get(0));
		Product item35 = new Product("pencil","Stationary","Apsara","made of high quality wood and features a strong lead that prevents breakage and provides a loner writing life",1.5,100,5,"2020-04-12","2020-06-13", storeList.get(0));
		Product item36 = new Product("Goodday","snacks","Britannia","With its delightful aroma and crunchy cookie bite,good day cookie comes with a smiley design on it as well",100,300,10,"2020-03-23","2020-11-26", storeList.get(0));
		Product item37 = new Product("Tea powder","Kitchen","Red Lable","Refreshing blend of  quality",0.1,200,53.21,"2021-02-03","2022-05-06", storeList.get(0));
		Product item38 = new Product("Oats","Kitchen","Safola","Least processed and contain most nutrition",0.2,500,76.56,"2021-02-03","2023-07-06", storeList.get(0));
		Product item39 = new Product("Sugar", "Kitchen", "Madhur", "Sugar is crystalline carbohydrates",06,800,76.56, "2021-02-03", "2021-07-06", storeList.get(0));
		Product item40 = new Product("Eggs", "Kitchen","Amul","Freshly dispatched eggs from hybrid chickens", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item41 = new Product("pen","stationary","Parker","Innovative high quality fine writing instrument crafted for writers,students and business professionals",1.5,50,10,"2021-09-24","2022-08-21", storeList.get(0));
		Product item42 = new Product("Eraser","Stationary","Nataraj","Nataraj eraser is used to erase the pencil marks from paper ,accepected for their rubbery consistency",32,50,5,"2020-01-10","2022-03-16", storeList.get(0));
		Product item43 = new Product("Atta", "Kitchen","Aashirvaad","Benfits of aashirvaad sugar release control atta", 10, 25, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item44 = new Product("Jeera Powder", "Kitchen","Aashirvaad","Benfits of aashirvaad powder release control ", 1, 20,80, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item45 = new Product("Turmaric Powder", "Kitchen","Aashirvaad","Benfits of aashirvaad powder release control ", 0.2,200,50.00, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item46 = new Product("Multigrains atta", "Kitchen","Aashirvad","Benfits of aashirvaad multigrains atta release control in atta", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item47 = new Product("Atta", "Kitchen","Aashirvaad","Benfits of aashirvaad sugar release control atta", 10, 25, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item48 = new Product("Turmaric Powder", "Kitchen","Aashirvaad","Benfits of aashirvaad powder release control ", 0.2,200,50.00, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item49 = new Product("Goodday","snacks","Britannia","With its delightful aroma and crunchy cookie bite,good day cookie comes with a smiley design on it as well",100,300,10,"2020-03-23","2020-11-26", storeList.get(0));
		Product item50 = new Product("Eggs", "Kitchen","Amul","Freshly dispatched eggs from hybrid chickens", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item51 = new Product("Maggie", "Kitchen", "Topromen", "Instant soup and noodles",0.1,200,10.00,"2020-02-03","2020-10-06", storeList.get(0));
		Product item52 = new Product("Ghee","Kitchen","Amul","It is incredibly versatile",0.2,200,100.00,"2021-02-03","2022-07-06", storeList.get(0));
		Product item53 = new Product("Chilli powder","Kitchen","Tikhalal","Naturally adds deep red colour to recipes",0.5,200,54.23,"2021-02-03","2021-12-06", storeList.get(0));
		Product item54 = new Product("pencil","Stationary","Apsara","made of high quality wood and features a strong lead that prevents breakage and provides a loner writing life",1.5,100,5,"2020-04-12","2020-06-13", storeList.get(0));
		Product item55 = new Product("face powder","ladies emporiem","LorealPowder","face powder and setting powder  find pressed powder,mattifying powder and transucent powder long lasting finish",0.1,10,150,"2020-01-01","2022-02-03", storeList.get(0));
		Product item56 = new Product("Eraser","Stationary","Nataraj","Nataraj eraser is used to erase the pencil marks from paper ,accepected for their rubbery consistency",32,50,5,"2020-01-10","2022-03-16", storeList.get(0));
		Product item57 = new Product("Goodday","snacks","Britannia","With its delightful aroma and crunchy cookie bite,good day cookie comes with a smiley design on it as well",100,300,10,"2020-03-23","2020-11-26", storeList.get(0));
		Product item58 = new Product("pen","stationary","Parker","Innovative high quality fine writing instrument crafted for writers,students and business professionals",1.5,50,10,"2021-09-24","2022-08-21", storeList.get(0));
		Product item59 = new Product("Cardamom", "Kitchen", "Spicebay", "To get smoky flavour",0.2,200,140, "2021-06-03", "2024-12-08", storeList.get(0));
		Product item60 = new Product("Flour", "Kitchen", "Aashirvaad", "It is more fluffy and soft rotiesat home,grinding process for the perfect balance ofcolour,taste ", 10,500,125,"2021-02-03", "2021-07-06", storeList.get(0));
		Product item61 = new Product("Rice", "kitchen", "India Gate", "Exotic class of Basmathi,it embodies all the attributes of a true basmati rice grain", 50,900,1000," 2020-06-10", "2022-05-10", storeList.get(0));
		Product item62 = new Product("Eggs", "Kitchen","Amul","Freshly dispatched eggs from hybrid chickens", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item63 = new Product("Sugar", "Kitchen", "Madhur", "Sugar is crystalline carbohydrates",15,200,150, "2021-02-03", "2021-07-06", storeList.get(0));
		Product item64 = new Product("Salt", "Kitchen", "Aashirvaad", "salt is a main mineral constitute",03,200,49.99, "2021-02-03", "2025-07-06", storeList.get(0));
		Product item65 = new Product("Oats","Kitchen","Safola","Least processed and contain most nutrition",0.3,500,200,"2021-02-03","2023-07-06", storeList.get(0));
		Product item66 = new Product("Ghee","Kitchen","Amul","It is incredibly versatile",0.3,500,510,"2021-02-03","2022-07-06", storeList.get(0));
		Product item67 = new Product("Chilli powder","Kitchen","Tikhalal","Naturally adds deep red colour to recipes",05,500,200,"2021-02-03","2021-12-06", storeList.get(0));
		Product item68 = new Product("Rice", "kitchen", "Basmathi", "Exotic class of Basmathi,it embodies all the attributes of a true basmati rice grain", 60,1000,800, "2020-06-10", "2022-05-10", storeList.get(0));
		Product item69 = new Product("chips","snacks","Lays"," ", 0.1,100,25, "12-02/2021","12/03/2025", storeList.get(0));
		Product item70 = new Product("Masalas ","Kitchen","MTR","Used  in cooking more varities of chicken,samber pickles ",0.2,200,26.00,"2021-02-03","2021-11-20", storeList.get(0));
		Product item71 = new Product("Flour", "Kitchen", "Aashirvaad", "It is more fluffy and soft rotiesat home,grinding process for the perfect balance ofcolour,taste ",20,200,250, "2021-02-03", "2021-07-06", storeList.get(0));
		Product item72 = new Product("Eggs", "Kitchen","Amul","Freshly dispatched eggs from hybrid chickens", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item73 = new Product("Boost","Kitchen","Nestle","Adds more energy",0.2,200,250,"2021-02-03","2022-08-12", storeList.get(0));
		Product item74 = new Product("Garlic paste","Kitchen","National","contains preservatives ",0.1,200,25.23,"2021-06-03","2022-04-05", storeList.get(0));
		Product item75 = new Product("Tea powder","Kitchen","Red Lable","Refreshing blend of  quality",0.3,200,180,"2021-02-03","2022-05-06", storeList.get(0));
		Product item76 = new Product("Goodday","snacks","Britannia","With its delightful aroma and crunchy cookie bite,good day cookie comes with a smiley design on it as well",100,300,10,"2020-03-23","2020-11-26", storeList.get(0));
		Product item77 = new Product("pen","stationary","Parker","Innovative high quality fine writing instrument crafted for writers,students and business professionals",1.5,50,10,"2021-09-24","2022-08-21", storeList.get(0));
		Product item78 = new Product("pencil","Stationary","Apsara","made of high quality wood and features a strong lead that prevents breakage and provides a loner writing life",1.5,100,5,"2020-04-12","2020-06-13", storeList.get(0));
		Product item79 = new Product("Eraser","Stationary","Nataraj","Nataraj eraser is used to erase the pencil marks from paper ,accepected for their rubbery consistency",32,50,5,"2020-01-10","2022-03-16", storeList.get(0));
		Product item80 = new Product("face powder","ladies emporiem","LorealPowder","face powder and setting powder  find pressed powder,mattifying powder and transucent powder long lasting finish",0.1,10,150,"2020-01-01","2022-02-03", storeList.get(0));
		Product item81 = new Product("Rice", "kitchen", "India Gate", "Exotic class of Basmathi,it embodies all the attributes of a true basmati rice grain", 50,900,500," 2020-06-10", "2022-05-10", storeList.get(0));
		Product item82 = new Product("Eggs", "Kitchen", "Desi", "Desi eggs  are ",0.2,200,30.05, "2006-03-25", "2006-05-20", storeList.get(0));
		Product item83 = new Product("Flour", "Kitchen", "Aashirvaad", "It is more fluffy and soft rotiesat home,grinding process for the perfect balance ofcolour,taste ", 2,300,350,"2021-02-03", "2021-07-06", storeList.get(0));
		Product item84 = new Product("Sugar", "Kitchen", "Madhur", "Sugar is crystalline carbohydrates", 06,500,250,"2021-02-03", "2021-07-06", storeList.get(0));
		Product item85 = new Product("Salt", "Kitchen", "Tata", "salt is a main mineral constitute",03,200,49.99, "2021-02-03", "2025-07-06", storeList.get(0));
		Product item86 = new Product("Cardamom", "Kitchen", "Spicebay", "To get smoky flavour", 0.2,300,250,"2021-06-03", "2024-12-08", storeList.get(0));
		Product item87 = new Product("Wheat", "Kitchen", "Organic Atta", "Smooth and easire",05,600,820, "2020-02-03", "2021-10-06", storeList.get(0));
		Product item88 = new Product("Maggie", "Kitchen", "Topromen", "Instant soup and noodles",0.3,500,60,"2020-02-03","2020-10-06", storeList.get(0));
		Product item89 = new Product("Oats","Kitchen","Safola","Least processed and contain most nutrition",3,600,520,"2021-02-03","2023-07-06", storeList.get(0));
		Product item90 = new Product("Oil","Kitchen","Sunflower","Excellent sources of vitamins E,B1,B6,Iron",6,800,730.25,"2020-02-03","2025-07-06", storeList.get(0));
		Product item91 = new Product("Turmaric Powder", "Kitchen","Aashirvaad","Benfits of aashirvaad powder release control ", 0.2,200,50.00, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item92 = new Product("Multigrains atta", "Kitchen","Aashirvad","Benfits of aashirvaad multigrains atta release control in atta", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item93 = new Product("Jeera Powder", "Kitchen","Aashirvaad","Benfits of aashirvaad powder release control ", 1, 20,80, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item94 = new Product("Turmaric Powder", "Kitchen","Aashirvaad","Benfits of aashirvaad powder release control ", 0.2,200,50.00, "12/2/2021", "12/2/2025", storeList.get(0));
		Product item95 = new Product("face powder","ladies emporiem","LorealPowder","face powder and setting powder  find pressed powder,mattifying powder and transucent powder long lasting finish",0.1,10,150,"2020-01-01","2022-02-03", storeList.get(0));
		Product item96 = new Product("Sugar", "Kitchen", "Madhur", "Sugar is crystalline carbohydrates",10,500,650, "2021-02-03", "2021-07-06", storeList.get(0));
		Product item97 = new Product("Salt", "Kitchen", "Tata", "salt is a main mineral constitute",03,200,49.99, "2021-02-03", "2025-07-06", storeList.get(0));
		Product item98 = new Product("Flour", "Kitchen", "Aashirvaad", "It is more fluffy and soft rotiesat home,grinding process for the perfect balance ofcolour,taste ",10,900,850, "2021-02-03", "2021-07-06", storeList.get(0));
		Product item99 = new Product("Chilli powder","Kitchen","Tikhalal","Naturally adds deep red colour to recipes",5,900,450,"2021-02-03","2021-12-06", storeList.get(0));
		Product item100 = new Product("Eggs", "Kitchen","Amul","Freshly dispatched eggs from hybrid chickens", 10, 20, 200, "12/2/2021", "12/2/2025", storeList.get(0));
		
		
		
		
		productDao.register(item1);
		productDao.register(item2);
		productDao.register(item3);
		productDao.register(item4);
		productDao.register(item5);
		productDao.register(item6);
		productDao.register(item7);
		productDao.register(item8);
		productDao.register(item9);
		productDao.register(item10);
		productDao.register(item11);
		productDao.register(item12);
		productDao.register(item13);
		productDao.register(item14);
		productDao.register(item15);
		productDao.register(item16);
		productDao.register(item17);
		productDao.register(item18);
		productDao.register(item19);
		productDao.register(item20);
		productDao.register(item21);
		productDao.register(item22);
		productDao.register(item23);
		productDao.register(item24);
		productDao.register(item25);
		productDao.register(item26);
		productDao.register(item27);
		productDao.register(item28);
		productDao.register(item29);
		productDao.register(item30);
		productDao.register(item31);
		productDao.register(item32);
		productDao.register(item33);
		productDao.register(item34);
		productDao.register(item35);
		productDao.register(item36);
		productDao.register(item37);
		productDao.register(item38);
		productDao.register(item39);
		productDao.register(item40);
		productDao.register(item41);
		productDao.register(item42);
		productDao.register(item43);
		productDao.register(item44);
		productDao.register(item45);
		productDao.register(item46);
		productDao.register(item47);
		productDao.register(item48);
		productDao.register(item49);
		productDao.register(item50);
		productDao.register(item51);
		productDao.register(item52);
		productDao.register(item53);
		productDao.register(item54);
		productDao.register(item55);
		productDao.register(item56);
		productDao.register(item57);
		productDao.register(item58);
		productDao.register(item59);
		productDao.register(item60);
		productDao.register(item61);
		productDao.register(item62);
		productDao.register(item63);
		productDao.register(item64);
		productDao.register(item65);
		productDao.register(item66);
		productDao.register(item67);
		productDao.register(item68);
		productDao.register(item69);
		productDao.register(item70);
		productDao.register(item71);
		productDao.register(item72);
		productDao.register(item73);
		productDao.register(item74);
		productDao.register(item75);
		productDao.register(item76);
		productDao.register(item77);
		productDao.register(item78);
		productDao.register(item79);
		productDao.register(item80);
		productDao.register(item81);
		productDao.register(item82);
		productDao.register(item83);
		productDao.register(item84);
		productDao.register(item85);
		productDao.register(item86);
		productDao.register(item87);
		productDao.register(item88);
		productDao.register(item89);
		productDao.register(item90);
		productDao.register(item91);
		productDao.register(item92);
		productDao.register(item93);
		productDao.register(item94);
		productDao.register(item95);
		productDao.register(item96);
		productDao.register(item97);
		productDao.register(item98);
		productDao.register(item99);
		productDao.register(item100);
		
		
	}
	
	@GetMapping("get_all_items")
	public List<Product> getAllProducts(){
		return productDao.getAllProducts();
	}
	
	@RequestMapping("get_products_by_store/{storeId}")
	public List<Product> getProductsByStore(@PathVariable("storeId") String storeId){
		return productDao.getProductsByStoreId(storeId);
	}
	
	@PostMapping("updateProduct")
	public void updateProduct(@RequestBody Product product) {
		productDao.updateProduct(product);
	}
	
	@PostMapping("addProduct")
	public void addProduct(@RequestBody Product product) {
		productDao.register(product);
	}
	
	@PostMapping("deleteProduct")
	public void deleteProduct(@RequestBody Product product) {
		productDao.deleteProduct(product);
	}
	
	@GetMapping("getProductByName/{productName}")
	public Product finProductByName(@PathVariable("productName") String productName) {
		return productDao.findProductByName(productName);
	}
}

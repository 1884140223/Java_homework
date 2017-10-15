package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Test_extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 宠物类
		 */
		Pet_extends_fu pet=new Pet_extends_dog();
//		Pet_extends_fu pet=new Pet_extends_cat();
		Pet_extends_comm pet_com=new Pet_extends_comm();
		System.out.println(pet_com.show(pet));
		
		/**
		 * 车类
		 */
		Car_extends_fu car=new Car_extends_bus();
//		Car_extends_fu car=new Car_extends_huo();
		Car_extends_comm car_comm=new Car_extends_comm();
		System.out.println(car_comm.show(car));
		
		/**
		 * 食物类
		 */
		Food_extends_fu food=new Food_extends_fan();
//		Food_extends_fu food=new Food_extends_noodle();
		Food_extends_comm food_com=new Food_extends_comm();
		System.out.println(food_com.show(food));
		
		/**
		 * 桌子类
		 */
		Zhuozi_extends_fu table =new Zhuozi_extends_class();
//		Zhuozi_extends_fu table=new Zhuozi_extends_book();
		Zhuozi_extends_comm table_com=new Zhuozi_extends_comm();
		System.out.println(table_com.show(table));
		
		/**
		 * 电脑类
		 */
		Computer_extends_fu computer =new Computer_extends_xiang();
//		Computer_extends_fu computer =new Computer_extends_hua();
		Computer_extends_comm computer_com =new Computer_extends_comm();
		System.out.println(computer_com.show(computer));
		
		/**
		 * 手机类
		 */
		Phone_extends_fu phone=new Phone_extends_iphine();
//		Phone_extends_fu phone=new Phone_extends_huawei();
		Phine_extends_comm phone_com=new Phine_extends_comm();
		System.out.println(phone_com.show(phone));
		
		/**
		 * 空调类
		 */
		Kongtiao_extends_fu kong=new Kongtiao_extends_mei();
//		Kongtiao_extends_fu kong=new Kongtiao_extends_geli();
		Kongtiao_extends_comm kong_comm=new Kongtiao_extends_comm();
		System.out.println(kong_comm.show(kong));
		
		/**
		 * 衣服类
		 */
		Clothing_extends_fu clothing =new Clothing_extends_X();
//		Clothing_extends_fu clothing =new Clothing_extends_adi();
		Clothing_extends_comm cloth=new Clothing_extends_comm();
		System.out.println(cloth.show(clothing));
		
		/**
		 * 水果类
		 */
		Fruit_extends_fu fruit=new Fruit_extends_apple();
//		Fruit_extends_fu fruit=new Fruit_extends_orange();
		Fruit_extends_comm fruit_com=new Fruit_extends_comm();
		System.out.println(fruit_com.show(fruit));
		
		/**
		 * 教师类
		 */
		Teacher_extends_fu teacher=new Teacher_extends_English();
//		Teacher_extends_fu teacher=new Teacher_extends_Chinese();
		Teacher_extends_comm teacher_com=new Teacher_extends_comm();
		System.out.println(teacher_com.show(teacher));
		
		
	}

}

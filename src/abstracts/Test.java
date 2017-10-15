package abstracts;
/**
 * 测试类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 宠物狗狗类		Pet
		 */
		Pet_zi pet=new Pet_zi();	//实例化对象
		System.out.println(pet.show());	//调用方法
		
		/**
		 * 个人信息类		Person
		 */
		Person_zi person=new Person_zi();	//实例化对象
		System.out.println(person.show());	//调用方法
		
		/**
		 * 汽车类			Car
		 */
		Car_zi car=new Car_zi();	//实例化对象
		System.out.println(car.show());	//调用方法
		
		/**
		 * 空调类		kongtiao
		 */
		Kongtiao_zi kongtiao=new Kongtiao_zi();	//实例化对象
		System.out.println(kongtiao.show());	//调用方法
		
		/**
		 * 充电器类			ChongDianQi
		 */
		ChongDianQi_zi ChongDianQi=new ChongDianQi_zi();	//实例化对象
		System.out.println(ChongDianQi.show());	//调用方法
		
		/**
		 * 微波炉		weibolu
		 */
		Weibilu_zi weibolu=new Weibilu_zi();	//实例化对象
		System.out.println(weibolu.show());	//调用方法
		
		/**
		 * 门类			Dor
		 */
		Dor_zi dor=new Dor_zi();	//实例化对象
		System.out.println(dor.show());	//调用方法
		
		/**
		 * usb接口类	
		 */
		Usb_zi usb=new Usb_zi();	//实例化对象
		System.out.println(usb.show());	//调用方法
		
		/**
		 * 电梯类
		 */	
		DianTi_zi dianti=new DianTi_zi();	//实例化对象
		System.out.println(dianti.show());	//调用方法
		
		/**
		 * 旅游类
		 */
		Lvyou_zi lvyou=new Lvyou_zi();	//实例化对象
		System.out.println(lvyou.show());	//调用方法
		
	}

}

package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Test_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 门接口
		 */
		Dor_interface dor=new Dor_interface_zi1();
//		Dor_interface dor=new Dor_interface_zi2();
		Dor_interface_com dor_com=new Dor_interface_com();
		System.out.println(dor_com.show(dor));
		
		/**
		 * 充电器接口
		 */
		Chongdainqi_interface chong=new Chongdainqi_interface_zi1();
//		Chongdainqi_interface chong=new Chongdainqi_interface_zi2();
		Chongdainqi_interface_com chong_com=new Chongdainqi_interface_com();
		System.out.println(chong_com.show(chong));
		
		/**
		 * 电灯接口
		 */
		Diandeng_interfance dian=new Diandeng_interfance_zi1();
//		Diandeng_interfance dian=new Diandeng_interfance_zi2;
		Diandeng_interfance_com dian_com=new Diandeng_interfance_com();
		System.out.println(dian_com.show(dian));
		
		/**
		 * 空调接口
		 */
		Kongtiao_interface kong=new Kongtiao_interface_zi1();
//		Kongtiao_interface kong=new Kongtiao_interface_zi2();
		Kongtiao_interface_com kong_com=new Kongtiao_interface_com();
		System.out.println(kong_com.show(kong));
		
		/**
		 * 饮水机接口
		 */
		Yinshuiji_interface yin=new Yinshuiji_interface_zi1();
//		Yinshuiji_interface yin=new Yinshuiji_interface_zi2();
		Yinshuiji_interface_com yin_com=new Yinshuiji_interface_com();
		System.out.println(yin_com.show(yin));
		
		/**
		 * usb接口
		 */
		Usb_interface usb=new Usb_interface_zi1();
//		Usb_interface usb =new Usb_interface_zi();
		Usb_interface_com usb_com=new Usb_interface_com();
		System.out.println(usb_com.show(usb));
		
		/**
		 * 教师接口
		 */
		Teacher_interface teacher =new Teacher_interface_zi1();
//		Teacher_interface teacher =new Teacher_interface_zi2();
		Teacher_interface_com teacher_com=new Teacher_interface_com();
		System.out.println(teacher_com.show(teacher));
		
		/**
		 * 车接口
		 */
		Car_interfance car=new Car_interfance_zi1();
//		Car_interfance car=new Car_interfance_zi2();
		Car_interfance_com car_com=new Car_interfance_com();
		System.out.println(car_com.show(car));
		
		/**
		 * 桌子接口
		 */
		Table_interface table=new Table_interface_zi1();
//		Table_interface table=new Table_interface_zi2();
		Table_interface_com table_com=new Table_interface_com();
		System.out.println(table_com.show(table));
		
		
		/**
		 * 计时器接口	使用了	instanceof	运算符
		 */
		Jishiqi_interface jishi=new Jishiqi_interface_zi1();
//		Jishiqi_interface jishi=new Jishiqi_interface_zi2();
		Jishiqi_interface_com jishi_com=new Jishiqi_interface_com();
		System.out.println(jishi_com.show(jishi));
		if(jishi instanceof Jishiqi_interface_zi1){
//			Jishiqi_interface_zi1 ji=(Jishiqi_interface_zi1)jishi;
			System.out.println("jishi是其子1类");
		}else if(jishi instanceof Jishiqi_interface_zi2){
//			Jishiqi_interface_zi2 ji=(Jishiqi_interface_zi2)jishi;
			System.out.println("jishi是其子2类");
		}
		
		
	}
}

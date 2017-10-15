package interfaces;
/**
 * 接口测试类
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */

public class Test_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 门接口的实现
		 */
		Dor dor=new Dor();	//实例化对象
		System.out.println(dor.open());	//调用方法实现功能
		System.out.println(dor.close());
		
		
		/**
		 * usb接口的实现
		 */
		Usb usb=new Usb();	//实例化对象
		System.out.println(usb.show());//调用方法实现功能
		System.out.println(usb.show1());
		
		/**
		 * 多媒体接口
		 */
		DuoMeiTi duomeiti=new DuoMeiTi();	//实例化对象
		System.out.println(duomeiti.show());//调用方法实现功能
		System.out.println(duomeiti.show1());
		
		/**
		 * 饮水机接口
		 */
		yinshuiji shui=new yinshuiji();	//实例化对象
		System.out.println(shui.show());//调用方法实现功能
		System.out.println(shui.show1());
		
		/**
		 * 空调接口
		 */
		Kongtiao kong=new Kongtiao();	//实例化对象
		System.out.println(kong.show());//调用方法实现功能
		System.out.println(kong.show1());
		
		/**
		 * 遥控器接口
		 */
		Yaokongqi key=new Yaokongqi();	//实例化对象
		System.out.println(key.show());//调用方法实现功能
		System.out.println(key.show1());
		System.out.println(key.show2());
		
		/**
		 * 电灯开关接口
		 */
		Kaiguan kai=new Kaiguan();	//实例化对象
		System.out.println(kai.show());//调用方法实现功能
		System.out.println(kai.show1());
		
		/**
		 * 计时器接口
		 */	
		Jishiqi jishi=new Jishiqi();	//实例化对象
		System.out.println(jishi.show());//调用方法实现功能
		
		/**
		 *耳机接口 
		 */
		Erji erji=new Erji();	//实例化对象
		System.out.println(erji.show());//调用方法实现功能
		System.out.println(erji.show1());
		
		
		
		
		/**
		 * 拍照、拍视频接口
		 */
		Pai pai=new Pai();	//实例化对象
		System.out.println(pai.show());//调用方法实现功能
		System.out.println(pai.show1());
		
		
	}

}

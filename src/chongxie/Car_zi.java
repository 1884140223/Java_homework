package chongxie;
/**
 * 车类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */


public class Car_zi extends Car_fu {
	/*对父类show()方法的重写，增加输出的信息量*/
	public String show(){
		System.out.println("车辆信息为：");
		String str="车辆品牌："+super.getBrand()+"\n车牌号："+super.getNumber()+"\n核载人数："+super.getType();
		return str;
	}
}

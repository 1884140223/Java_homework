package abstracts;
/**
 * 汽车类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Car_zi extends Car_fu {
	public Car_zi(){	//子类的构造方法
		super.setType("轿车");
		super.setBrand("奔驰");
		super.setColor("黑色");
	}
	@Override
	public String show() {	//对父类的抽象方法的重写
		// TODO Auto-generated method stub
		String str="汽车类型："+super.getType()+"\n汽车品牌："+super.getBrand()+"\n汽车颜色："+super.getColor();
		return str;
	}

}

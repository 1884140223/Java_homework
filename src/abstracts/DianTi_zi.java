package abstracts;
/**
 * 电梯类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class DianTi_zi extends DianTi_fu {
	public DianTi_zi(){			//子类构造方法
		super.setHeight("2m");
		super.setWidth("1m");
	}
	public String show(){	//对父类普通方法进行重写
		String str="电梯正在运行……请稍后";
		str=str+"\n电梯高度"+super.getHeight()+"\t电梯宽度"+super.getWidth();
		return str;
	}
	
}

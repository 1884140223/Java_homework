package abstracts;
/**
 * 门类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Dor_zi extends Dor_fu {
	public Dor_zi(){		//子类的构造方法
		super.setHeight("2m");
		super.setWidth("0.8m");
	}
	public String show(){		//对父类普通方法的重写
		String str="正在开门……";
		str=str+"\n门高："+super.getHeight()+"\t门宽"+super.getWidth();
		return str;
	}
}

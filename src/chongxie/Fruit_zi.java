package chongxie;
/**
 * 水果类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Fruit_zi extends Fruit_fu {
	public String show(){		//对父类show()方法进行重写
		super.setName("话梅");
		String str=super.getName()+"吃起来是酸的";
		return str;
	}
}

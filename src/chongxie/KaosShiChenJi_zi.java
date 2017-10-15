package chongxie;
/**
 * 考试类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class KaosShiChenJi_zi extends KaosShiChenJi_fu{
	public String show(){	//对父类show()方法重写，增加考试合格的返回信息
		String str=super.getCource()+":"+super.getNumber();
		str=str+"\n考试合格";
		return str;
	}
}

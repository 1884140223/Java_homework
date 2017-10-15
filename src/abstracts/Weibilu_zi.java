package abstracts;
/**
 * 微波炉类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Weibilu_zi extends Weibilu_fu {
	public Weibilu_zi(){	//子类构造方法
		super.setTime("5分钟");
		super.setType("鱼");
	}
	@Override
	public String show() {		//对父类抽象方法重写
		// TODO Auto-generated method stub
		String str="正在热"+super.getType()+"中……";
		str=str+"\n热"+super.getType()+"需要"+super.getTime();
		return str;
	}

}

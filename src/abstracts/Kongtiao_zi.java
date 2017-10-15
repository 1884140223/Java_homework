package abstracts;
/**
 * 空调类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Kongtiao_zi extends Kongtiao_fu {
	public Kongtiao_zi(){		//构造方法
		super.setTemperature("25度");
		super.setWind("强风");
	}
	@Override
	public String show() {		//对父类抽象方法的重写
		// TODO Auto-generated method stub
		String str="正在制冷中……";
		str=str+"\n温度："+super.getTemperature()+"\n风速："+super.getWind();
		return str;
	}

}

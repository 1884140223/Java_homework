package abstracts;
/**
 * 充电器类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class ChongDianQi_zi extends ChongDianQi_fu {
	public ChongDianQi_zi(){	//子类的构造方法
		super.setVoltage("220V");
		super.setElectricity("1.5A");
	}
	@Override
	public String show() {	//对父类抽象方法的重写
		// TODO Auto-generated method stub
		String str="正在充电中……";
		str=str+"\n电压："+super.getVoltage()+"\n电流："+super.getElectricity();
		return str;
	}

}

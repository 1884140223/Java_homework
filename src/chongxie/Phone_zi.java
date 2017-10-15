package chongxie;
/**
 * 动物类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Phone_zi extends Phone_fu {
	public String show(){		//对父类show()方法进行重写，增加返回信息
		String str="我是："+super.getBrand()+"\t型号："+super.getType();
		str=str+"\n我是安卓智能手机";
		return str;
	}
}

package chongxie;
/**
 * 超市商品类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Supermarket_zi extends Supermarket_fu{
	/*对父类show()方法重写*/
	public String show(){
		String str="商品名称："+super.getName()+"\n商品价格："+super.getMoney();
		return str;
	}
}

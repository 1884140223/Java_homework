package chongzai;
/**
 * 水果类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Fruit {
	private String name="orange";		//水果名
	private String color="橘红色的";		//水果颜色
	public String print(){				/*方法print:返回水果是什么颜色的字符串*/
		String str=name+"是"+color;
		return str;
	}
	
	/*	对方法print()进行方法重载	*/
	public String print(String name,String color){
		this.name=name;
		this.color=color;
		String str=name+"是"+color;
		return str;
	}
}

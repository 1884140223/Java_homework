package chongzai;
/**
 * 糖果类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Sweet {
	String name="阿尔卑斯";		//糖果名	品牌
	String money="￥5";			//售价
	public String print(){		/*方法print():返回商品价格信息*/
		String str=name+"\t售价为:"+money;
		return str;
	}
	
	/*	对方法print()进行方法重载	*/
	public String print(String name,String money){
		this.name=name;
		this.money=money;
		String str=name+"\t售价为:"+money;
		return str;
	}
}

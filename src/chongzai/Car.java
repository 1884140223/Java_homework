package chongzai;
/**
 * 汽车类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Car {
	private String brand="宝马";			//汽车品牌
	private String number="京AA0001";	//车牌号
	private String money="￥1000000";		//汽车售价
	public String print(){			/*方法print()：返回车辆信息*/
		String str=brand+"\t车牌号"+number+"\t售价"+money;
		return str;
	}
	
	/*	对方法print()进行方法重载	*/
	public String print(String brand,String number,String money){
		this.brand=brand;
		this.number=number;
		this.money=money;
		String str=brand+"\t车牌号"+number+"\t售价"+money;
		return str;
	}
}

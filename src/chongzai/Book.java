package chongzai;
/**
 * 书籍类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Book {
	private String name="三国演义";		//书名
	private int ye=563;					//书籍已阅读页数
	
	public String print(){				/*无参方法：输出阅读的页数*/
		String str="你正在读："+name+",你已经读了"+ye+"页";
		return str;
	}
	public String print(String name,int ye){	/*对无参方法print()的重载*/
		this.name=name;
		this.ye=ye;
		String str="你正在读："+name+",你已经读了"+ye+"页";
		return str;
	}
}

package chongzai;
/**
 * 糖果类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Work {
	private String job="JAVA高级软件工程师";			//所招聘的职位
	private String pay="8k~10K";			//工资待遇
	private String company="瓜子网";		//招聘公司
	public String print(){				/*方法print()：返回招聘的基本信息*/
		String str="招聘："+job+"\t工资待遇："+pay+"\t公司："+company;
		return str;
	}
	
	/*	对方法print()进行方法重载	*/
	public String print(String job,String pay,String company){
		this.job=job;
		this.pay=pay;
		this.company=company;
		String str="招聘："+job+"\t工资待遇："+pay+"\t公司："+company;
		return str;
	}
	
}

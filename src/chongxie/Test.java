package chongxie;
/**
 * 测试类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 动物类重写		Animal
		 */
		Animal_zi animal=new Animal_zi();	//实例化对象
		System.out.println(animal.show());	//调用方法
		
		/**
		 * 学校职工类重写	School
		 * 
		 */
		School_zi school=new School_zi();	//实例化对象
		System.out.println(school.show());	//调用方法
		
		/**
		 * 超市商品类	Supermarket
		 * 
		 */
		Supermarket_zi supermarket=new Supermarket_zi();	//实例化对象
		System.out.println(supermarket.show());	//调用方法
		
		/**
		 * 考试成绩类			KaosShiChenJi
		 */
		KaosShiChenJi_zi kaosShiChenJi=new KaosShiChenJi_zi();	//实例化对象
		System.out.println(kaosShiChenJi.show());	//调用方法
		
		/**
		 * 车辆类			Car
		 */
		Car_zi car=new Car_zi();	//实例化对象
		System.out.println(car.show());	//调用方法
		
		/**
		 * 手机类		Phone
		 */
		Phone_zi phone=new Phone_zi();	//实例化对象
		System.out.println(phone.show());	//调用方法
		
		/**
		 * 大学类			college
		 */
		College_zi college=new College_zi();	//实例化对象
		System.out.println(college.show("北京大学", "23145", "北京", "985高校"));	//调用方法
		
		/**
		 * 家庭类		Family
		 */
		Family_zi family=new Family_zi();	//实例化对象
		System.out.println(family.show());	//调用方法
		
		/**
		 * 歌曲类		Song
		 */
		Song_zi song=new Song_zi();	//实例化对象
		System.out.println(song.show("浮夸", "陈奕迅"));	//调用方法
		
		/**
		 * 水果类			Fruit
		 */
		Fruit_zi fruit =new Fruit_zi();	//实例化对象
		System.out.println(fruit.show());	//调用方法
	}

}

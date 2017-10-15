package chongzai;
/**
 * 方法的重载的测试类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 重载动物类-----Animal
		 */
		Animal animal=new Animal();		//对Animal类进行实例化对象
		/*不同的实例化对象调用类方法，并输出打印*/
		System.out.println(animal.print());		
		System.out.println(animal.print("大黄"));
		
		/**
		 * 重载个人信息类----------Person
		 */
		Person person=new Person();		//实例化对象
		System.out.println(person.print());		//对象调用原本方法并输出打印
		System.out.println(person.print("合肥"));		//对象调用重载的方法并输出打印
		
		/**
		 * 普通方法重载
		 * 重载学生类------Student
		 */
		Student student=new Student();		//实例化对象
		System.out.println(student.print());	//对象调用原本方法并输出打印
		System.out.println(student.print("安徽科技学院"));	//对象调用重载的方法并输出打印
		
		/**
		 * 普通方法重载
		 * 重载水果类--------Fruit
		 */
		Fruit fruit=new Fruit();		//实例化对象
		System.out.println(fruit.print());	//对象调用原本方法并输出打印
		System.out.println(fruit.print("西瓜","绿色"));	//对象调用重载的方法并输出打印
		
		/**
		 * 普通方法重载
		 * 重载糖果类--------Sweet
		 */
		Sweet sweet=new Sweet();		//实例化对象
		System.out.println(sweet.print());	//对象调用原本方法并输出打印
		System.out.println(sweet.print("真知棒","￥5"));	//对象调用重载的方法并输出打印
		
		/**
		 * 普通方法重载
		 * 重载汽车类-------Car
		 */
		Car car=new Car();		//实例化对象
		System.out.println(car.print());	//对象调用原本方法并输出打印
		System.out.println(car.print("奔驰","皖SB56231","￥800000"));	//对象调用重载的方法并输出打印
		
		/**
		 * 普通方法重载
		 * 重载电影类----------Movie
		 */
		Movie movie=new Movie();		//实例化对象
		System.out.println(movie.print());	//对象调用原本方法并输出打印
		System.out.println(movie.print("摔跤吧爸爸","阿米尔汗"));	//对象调用重载的方法并输出打印
		
		/**
		 * 普通方法重载
		 * 招聘工资类----------Work
		 */
		Work work=new Work();		//实例化对象
		System.out.println(work.print());	//对象调用原本方法并输出打印
		System.out.println(work.print("Java实习生","3k~5k","北大青鸟"));	//对象调用重载的方法并输出打印
		
		/**
		 * 普通方法重载
		 * 手机类----------Phone
		 */
		Phone phone=new Phone();		//实例化对象
		System.out.println(phone.print());	//对象调用原本方法并输出打印
		System.out.println(phone.print("小米","小米6","智能机"));	//对象调用重载的方法并输出打印
		
		/**
		 * 普通方法重载
		 * 书本类----------Book
		 */
		Book book=new Book();		//实例化对象
		System.out.println(book.print());	//对象调用原本方法并输出打印
		System.out.println(book.print("水浒传",1391));	//对象调用重载的方法并输出打印
		
		
		
		
		
		
		
	}

}

package basetest;
import org.imooc.bean.Items;
import org.imooc.service.ItemsService;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;
public class BaseTest {
	@Autowired
	private ItemsService itemsService;
	@Test
	public void Test(){
		Items items=itemsService.findItemsById(1);
		System.out.println(items.toString());
	}
}

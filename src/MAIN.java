import com.alibaba.fastjson.JSON;

public class MAIN {

    public static void main(String[] args) {
        Fruits strawberries = new Fruits(Fruits.Type.strawberry,20,5,100);

        String json = JSON.toJSONString(strawberries);

        System.out.println(json);

    }
}

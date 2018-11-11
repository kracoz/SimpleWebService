package ru.kracoz.ws;


// таже аннотация, что и при описании интерфейса,
import javax.jws.WebService;

// но здесь используется с параметром endpointInterface,
// указывающим полное имя класса интерфейса нашего веб-сервиса
@WebService(endpointInterface = "ru.kracoz.ws.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {
    @Override
    public String getHelloString(String name) {
        // просто возвращаем приветствие
        return "Hello, " + name + "!";
    }

    @Override
    public int getSum1(int a, int b, int c) {
        return a + b + c;
    }
}

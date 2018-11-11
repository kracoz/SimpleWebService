package ru.kracoz.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

// говорим, что наш интерфейс будет работать как веб-сервис
@WebService
// говорим, что веб-сервис будет использоваться для вызова методов
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface HelloWebService {
    // говорим, что этот метод можно вызывать удаленно
    @WebMethod
    public String getHelloString(String name);

    @WebResult(name = "summ")
    @WebMethod()
    public int getSum1(@WebParam(name = "a")int a, @WebParam(name = "b")int b,@WebParam(name = "c") int c);

}
package alexa;

import alexa.model.Request;
import alexa.model.Response;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Request, Response>{
    public Response handleRequest(Request request, Context context) {
        String greetingString = String.format("Hello %s %s.", request.getFirstName(), request.getLastName());
        return new Response(greetingString);
    }
}

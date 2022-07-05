package com.employeemanagement.www.api;

import com.employeemanagement.www.model.AdminUserSignIn;
import com.employeemanagement.www.model.AdminUserSignUp;
import com.employeemanagement.www.model.Error;
import com.employeemanagement.www.model.Token;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link AdminUserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-04T22:21:26.089-05:00[America/Chicago]")
public interface AdminUserApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /adminUser/signIn
     * To signin as an admin user
     *
     * @param adminUserSignIn Admin User SignIn Request (optional)
     * @return Admin user signed in successfully (status code 200)
     *         or Error in signin (status code 400)
     * @see AdminUserApi#adminUserSignIn
     */
    default ResponseEntity<Token> adminUserSignIn(AdminUserSignIn adminUserSignIn) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"jwt\" : \"jwt\", \"userName\" : \"userName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /adminUser/signUp
     * To signup a new admin user
     *
     * @param adminUserSignUp Admin User SignUp Request (optional)
     * @return Successfully signedup an admin user (status code 200)
     *         or Error in siging up an admin user (status code 400)
     * @see AdminUserApi#adminUserSignUp
     */
    default ResponseEntity<AdminUserSignUp> adminUserSignUp(AdminUserSignUp adminUserSignUp) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailAddress\" : \"emailAddress\", \"password\" : \"password\", \"userName\" : \"userName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

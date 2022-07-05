package com.employeemanagement.www.api;

import java.math.BigDecimal;
import com.employeemanagement.www.model.Employee;
import com.employeemanagement.www.model.Error;
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
 * A delegate to be called by the {@link EmployeeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-04T22:21:26.089-05:00[America/Chicago]")
public interface EmployeeApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /employee/add
     * To add a new employee
     *
     * @param employee Structure of an Employee (optional)
     * @return Employee added successfully (status code 200)
     *         or Error in adding employee (status code 400)
     * @see EmployeeApi#addNewEmployee
     */
    default ResponseEntity<Employee> addNewEmployee(Employee employee) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailAddress\" : \"emailAddress\", \"employeeId\" : 0.8008281904610115, \"designation\" : \"designation\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /employee/{employeeId}
     * To delete an existing employee
     *
     * @param employeeId  (required)
     * @return Employee not found (status code 404)
     * @see EmployeeApi#deleteExistingEmployee
     */
    default ResponseEntity<Void> deleteExistingEmployee(BigDecimal employeeId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /employee/{employeeId}
     * To get an existing employee
     *
     * @param employeeId  (required)
     * @return Employee retrieved successfully (status code 200)
     *         or Employee not found (status code 404)
     * @see EmployeeApi#getExistingEmployee
     */
    default ResponseEntity<Employee> getExistingEmployee(BigDecimal employeeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailAddress\" : \"emailAddress\", \"employeeId\" : 0.8008281904610115, \"designation\" : \"designation\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /employee/{employeeId}
     * To update an exisitng employee
     *
     * @param employeeId  (required)
     * @param employee Structure of an Employee (optional)
     * @return Employee updated successfully (status code 200)
     *         or Error in updating employee (status code 400)
     *         or Employee not found (status code 404)
     * @see EmployeeApi#updateExistingEmployee
     */
    default ResponseEntity<Employee> updateExistingEmployee(BigDecimal employeeId,
        Employee employee) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailAddress\" : \"emailAddress\", \"employeeId\" : 0.8008281904610115, \"designation\" : \"designation\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

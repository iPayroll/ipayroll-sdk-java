package nz.co.ipayroll.api.sdk.employee.impl;

import com.google.gson.Gson;
import nz.co.ipayroll.api.sdk.employee.EmployeeService;
import nz.co.ipayroll.api.sdk.employee.vo.EmployeeResource;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public EmployeeResource employee() {
        String json = "{\n" + "     \"surname\": \"API\",\n" + "     \"firstNames\": \"Joe\",\n" + "     \"employeeId\": \"tt1234s\",\n"
                + "     \"address\": {\n" + "       \"suburb\": \"dfsfsdf\"\n" + "     },\n" + "     \"startDate\": \"03-Oct-2016\",\n"
                + "     \"email\": \"\",\n" + "     \"phone\": \"\",\n" + "     \"title\": \"\",\n" + "     \"gender\": \"Male\",\n"
                + "     \"payFrequency\": \"Weekly\",\n" + "     \"fullTimeHoursWeek\": 40,\n" + "     \"organisation\": 60000\n" + "  }";

        Gson gson = new Gson();
        return gson.fromJson(json, EmployeeResource.class);
    }
}

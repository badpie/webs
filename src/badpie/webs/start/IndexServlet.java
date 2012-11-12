package badpie.webs.start;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IndexServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(out, buildData());
        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

    private Object buildData() {
        Category category = new Category();
        category.setId("1");
        category.setName("电视剧");
        category.setTotal(100);
        category.setUpdate(new Date(System.currentTimeMillis()));
        return  category;
    }

}

package Repo;

import Beans.Employee;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Wednesday June 2023
 * @Time: 12:49 PM
 */
public interface JsonPlaceHolderApi {
    @GET("users/{user}/repos")
    Call<List<Employee>> listRepos(@Path("user") String user);

    @GET("posts")
    Call<List<Employee>> getPosts(@Query("id") int employee);

    @GET("posts/{id}/comments")
    Call<List<Employee>> getComment(@Path("id") int id);

}

package top.ldtianzhe.mylibrary.api;

import org.json.JSONObject;

import top.ldtianzhe.mylibrary.utils.okhttp3.api.ApiUtil;

public class UserLoginApi extends ApiUtil {

    public String mResponse;

    public UserLoginApi(String userName, String userPassword) {
        addParams("userName", userName);
        addParams("userPassword", userPassword);
    }

    @Override
    protected void parseData(JSONObject jsonObject) throws Exception {
        mResponse = jsonObject.toString();
    }

}

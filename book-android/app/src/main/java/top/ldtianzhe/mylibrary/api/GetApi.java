package top.ldtianzhe.mylibrary.api;

import org.json.JSONObject;

import top.ldtianzhe.mylibrary.utils.okhttp3.api.ApiUtil;

public class GetApi extends ApiUtil {
    public String mResponse;


    @Override
    protected void parseData(JSONObject jsonObject) throws Exception {
        mResponse = jsonObject.toString();

    }
//
//    @Override
//    protected String getUrl() {
//        return CONTENST.ALL_BOOK_LIST;
//    }
}

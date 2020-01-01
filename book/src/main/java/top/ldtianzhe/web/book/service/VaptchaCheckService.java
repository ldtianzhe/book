package top.ldtianzhe.web.book.service;

/**
 * @Auther: ldtianzhe
 * @Description:
 */
public interface VaptchaCheckService {

    /**
     * @param token
     * @param ip
     * @return : boolean
     * @description: 人机验证结果校验
     */
    boolean vaptchaCheck(String token, String ip) throws Exception;
}

package com.example.sourceCode.exction;

import org.apache.ibatis.exceptions.PersistenceException;

/**
 * @Auther: GEEX1428
 * @Date: 2021/2/26 16:26
 * @Description:
 */
public class TestExction extends PersistenceException {

    private static final long serialVersionUID = 9064346017604487876L;

    public TestExction() {
        super();
    }

    public TestExction(String message) {
        super(message);
    }

    public static void main(String[] args) {
        throw new TestExction("NullPointExction空指针异常");
    }
}

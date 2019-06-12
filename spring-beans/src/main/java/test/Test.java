/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * 2019年6月12日16:36:57
 * @author zhouzhongqing
 */
public class Test {
    public static final int cardDataArray[] = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方
        0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅
        0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红
        0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D,//黑
        0x41, 0x42,//大小王
};
	 /**
     * 用XmlBeanFactory这个方式获得bean,现在已经不用这个方式了
     */
    public static void main(String []args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-base.xml"));
        //从这里点进去
        MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
        System.out.println(myTestBean + "--" +myTestBean.getName());
        MyTestBean myTestBean2 = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
        for (int i = 0; i < cardDataArray.length; i++) {
        	System.out.println(cardDataArray[i]);	
		}
        
    }
}

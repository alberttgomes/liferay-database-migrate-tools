package com.liferay.convert.tools;

import com.liferay.convert.tools.migrate.ReplacementLiferayScheme;
import com.liferay.convert.tools.util.PrintUtil;


/**
 * @author Albert Gomes Cabral
 */
public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("============================================================");
        System.out.println("=================== STARTING APPLICATION ===================");
        System.out.println("============================================================");
        System.out.println("\nConverting database types between Oracle and MySQL tools ..");

        ReplacementLiferayScheme replacementLiferayScheme = new ReplacementLiferayScheme();

        boolean replace = replacementLiferayScheme.replacement(
                _SOURCE_FILE_NAME, _TARGET_FILE_NAME, _NEW_FILE_NAME);

        if (replace) {
            PrintUtil.print(PrintUtil.GREEN,
                    "Dump file was replacement with success.");
        }
        else {
            PrintUtil.print(PrintUtil.RED,
                    "Replace fail. Try again!");
        }

        System.out.println("=============================================================");
        System.out.println("====================== END APPLICATION ======================");
        System.out.println("=============================================================");
    }

    private static final String _SOURCE_FILE_NAME = "liferay-mysql-dump.sql";
    private static final String _TARGET_FILE_NAME = "customer-mysql-dump.sql";
    private static final String _NEW_FILE_NAME = "customer-mysql-dump-out-put.sql";

}
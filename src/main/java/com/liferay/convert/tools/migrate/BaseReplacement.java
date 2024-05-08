package com.liferay.convert.tools.migrate;

/**
 * @author Albert Gomes Cabral
 */
public abstract class BaseReplacement {

    protected abstract void replacement(
            String sourceFileName, String targetFileName, String newFileName)
        throws Exception;

    protected String getType() {
        if (_type == null) {
            _setType(_DEFAULT_TYPE);
        }

        return _type;
    }

    protected String type(String type) throws Exception {
        if (type == null || type.isEmpty()) {
            _setType(_DEFAULT_TYPE);
        }
        else {
            _setType(type);
        }

        return _type;
    }

    private void _setType(String type) {
        this._type = type;
    }

    // The default type to database for while is mysql

    private static final String _DEFAULT_TYPE = "mysql";

    // attributes variables

    private String _type;

}

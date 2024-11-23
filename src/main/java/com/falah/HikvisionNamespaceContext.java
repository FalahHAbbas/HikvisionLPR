package com.falah;

import javax.xml.namespace.NamespaceContext;
import java.util.Iterator;

public class HikvisionNamespaceContext implements NamespaceContext {

        @Override
        public String getNamespaceURI(String prefix) {
            if ("ns".equals(prefix)) {
                return "http://www.hikvision.com/ver20/XMLSchema";
            }
            return null;
        }

        @Override
        public String getPrefix(String namespaceURI) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Iterator getPrefixes(String namespaceURI) {
            throw new UnsupportedOperationException();
        }
}

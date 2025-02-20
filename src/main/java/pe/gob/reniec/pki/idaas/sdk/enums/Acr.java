package pe.gob.reniec.pki.idaas.sdk.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Miguel Pazo (http://miguelpazo.com)
 */
public enum Acr {

    PKI_DNIE("pki_dnie"),
    PKI_TOKEN("pki_token"),
    PKI_DNIE_MOBILE("pki_dnie_mobile"),
    PKI_DNIE_LEGACY("pki_dnie_legacy"),
    PKI_TOKEN_LEGACY("pki_token_legacy"),
    ONE_FACTOR("one_factor"),
    TWO_FACTOR("two_factor"),
    ONLY_PASSWORD("only_password"),
    ONLY_QUESTIONS("only_questions"),
    FINGERPRINT_MOBILE("only_questions"),
    FACE_MOBILE("only_questions"),
    TWO_FACTOR_MOBILE("only_questions");
    private String value;
    private static final Map<String, Acr> lookup = new HashMap<>();

    static {
        for (Acr d : Acr.values()) {
            lookup.put(d.getValue(), d);
        }
    }

    Acr(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Acr get(String value) {
        return lookup.get(value);
    }

}

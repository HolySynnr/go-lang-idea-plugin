package ro.redeul.google.go.lang.psi.types.struct;

import ro.redeul.google.go.lang.psi.GoPsiElement;
import ro.redeul.google.go.lang.psi.types.GoTypeName;

/**
 * Author: Toader Mihai Claudiu <mtoader@gmail.com>
 * <p/>
 * Date: 5/29/11
 * Time: 1:54 PM
 */
public interface GoTypeStructAnonymousField extends GoPsiElement {

    GoTypeName getType();

}

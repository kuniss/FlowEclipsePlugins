/*
* generated by Xtext
*/
package de.grammarcraft.csflow.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

import de.grammarcraft.csflow.flow.EbcOperation;
import de.grammarcraft.csflow.flow.Flow;
import de.grammarcraft.csflow.flow.Import;
import de.grammarcraft.csflow.flow.MethodOperation;
import de.grammarcraft.csflow.flow.NamedPort;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class FlowLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public FlowLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(Import element) {
		return "import " + element.getImportedNamespace();
	}
	
	String text(Flow element) {
		return "flow " + element.getName();
	}
	
 	String text(NamedPort element) {
		return "port " + element.getName();
	}
	
 	String text(EbcOperation element) {
		return "EBC operation " + element.getName();
	}

 	String text(MethodOperation element) {
		return "Method operation " + element.getName();
	}

/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}

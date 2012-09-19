
package de.grammarcraft.csflow.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import de.grammarcraft.csflow.flow.Operation;
import de.grammarcraft.csflow.validation.FlowJavaValidator;

public class FlowQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(FlowJavaValidator.NAME_MUST_BE_UNIQUE)
	public void AddIndex(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
				"Add index",    // label
				"Add index 1 to '" + issue.getData()[0] + "' for uniquness", // description
				"upcase.png",           // icon 
			    new ISemanticModification() {
					public void apply(EObject element, IModificationContext context) {
						Operation op = (Operation) element;
						op.setName(op.getName() + "1");
					}
		    	}
		);
//			    new IModification() {
//					public void apply(IModificationContext context) throws BadLocationException {
//						IXtextDocument xtextDocument = context.getXtextDocument();
//						xtextDocument.replace(issue.getOffset(), issue.getLength(), "");
//					}
//				}
//		);
	} 


//	@Fix(MyJavaValidator.INVALID_NAME)
//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument xtextDocument = context.getXtextDocument();
//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
//			}
//		});
//	}

}
